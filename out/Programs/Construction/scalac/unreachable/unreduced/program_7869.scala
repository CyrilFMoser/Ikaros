package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (T_A[Byte, Boolean],T_A[Int, Char])) extends T_A[C, T_A[T_A[Byte, Int], Int]]
case class CC_B[D](a: D) extends T_A[D, T_A[T_A[Byte, Int], Int]]

val v_a: T_A[Boolean, T_A[T_A[Byte, Int], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_) => 1 
}
}