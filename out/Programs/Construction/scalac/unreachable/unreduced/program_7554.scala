package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Char, Int], T_A[Boolean, Boolean]], C]
case class CC_B[D](a: (CC_A[Char],T_A[Int, Byte])) extends T_A[T_A[T_A[Char, Int], T_A[Boolean, Boolean]], D]
case class CC_C() extends T_A[T_A[T_A[Char, Int], T_A[Boolean, Boolean]], Byte]

val v_a: T_A[T_A[T_A[Char, Int], T_A[Boolean, Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((CC_A(_),_)) => 1 
  case CC_C() => 2 
}
}