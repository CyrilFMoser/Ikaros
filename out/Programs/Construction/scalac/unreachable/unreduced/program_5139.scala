package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_B[Boolean]]]
case class CC_B(a: (Int,T_A[(Int,Char)]), b: Byte) extends T_A[T_A[T_B[Boolean]]]
case class CC_C(a: T_A[(CC_A,CC_A)]) extends T_A[T_A[T_B[Boolean]]]
case class CC_D(a: (Int,Byte), b: T_A[T_A[CC_B]], c: T_A[CC_B]) extends T_B[T_A[T_B[CC_C]]]
case class CC_E(a: CC_B, b: T_B[CC_C]) extends T_B[T_A[T_B[CC_C]]]
case class CC_F(a: CC_E) extends T_B[T_A[T_B[CC_C]]]

val v_a: T_A[T_A[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B((_,_), _)