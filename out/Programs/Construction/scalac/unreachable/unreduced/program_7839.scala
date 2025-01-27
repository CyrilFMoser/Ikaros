package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Char,T_A[Boolean, Char])) extends T_A[T_A[T_A[Boolean, Int], T_A[Int, Boolean]], T_A[T_A[Char, Char], Int]]
case class CC_B(a: (CC_A[Boolean],CC_A[Int])) extends T_A[T_A[T_A[Boolean, Int], T_A[Int, Boolean]], T_A[T_A[Char, Char], Int]]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Int, Boolean]], T_A[T_A[Char, Char], Int]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B((CC_A(_),CC_A(_))) => 1 
}
}