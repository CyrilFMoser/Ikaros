package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Byte, b: C, c: T_A[C]) extends T_A[C]
case class CC_B[D](a: Byte, b: T_B[D], c: (Boolean,T_A[Boolean])) extends T_A[D]
case class CC_C(a: T_A[CC_A[Int]]) extends T_B[T_A[CC_A[Char]]]
case class CC_D() extends T_B[T_A[CC_A[Char]]]
case class CC_E(a: T_A[CC_B[Char]], b: CC_C, c: T_B[T_A[CC_C]]) extends T_B[T_A[CC_A[Char]]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, CC_A(_, _, _), _)) => 0 
  case CC_C(CC_B(_, _, (_,_))) => 1 
}
}