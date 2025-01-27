package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Char, Char]], b: Char) extends T_A[T_B[T_B[Boolean, Byte], T_A[Int]]]
case class CC_B() extends T_A[T_B[T_B[Boolean, Byte], T_A[Int]]]
case class CC_C(a: T_A[CC_A]) extends T_A[T_B[T_B[Boolean, Byte], T_A[Int]]]
case class CC_D[D](a: D, b: Char) extends T_B[D, Byte]

val v_a: T_A[T_B[T_B[Boolean, Byte], T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_)