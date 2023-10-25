public class CatsAndShelves {
        public static int solution(int start, int finish)
        {
            int jumpCounter = 0;
            for (int i = start; i <= finish;i++) {
              if (start + 3 <= finish){
                  start += 3;
                  jumpCounter++;
              } else if (start + 1 <= finish) {
                  start += 1;
                  jumpCounter++;
              }
            }
            return jumpCounter;
        }
    }

