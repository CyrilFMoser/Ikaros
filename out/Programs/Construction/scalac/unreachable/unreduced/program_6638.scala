package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Int, Boolean]], b: Byte, c: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_B() extends T_A[T_A[Byte]]
case class CC_C(a: CC_A) extends T_A[T_A[Byte]]
case class CC_D[D]() extends T_B[D, CC_B]
case class CC_E(a: CC_B) extends T_B[Byte, CC_B]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_)