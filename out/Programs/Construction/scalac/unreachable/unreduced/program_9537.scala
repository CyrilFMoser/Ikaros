package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Boolean, b: T_B[(Char,Byte), ((Char,Byte),Byte)]) extends T_A[T_A[T_B[(Char,Int), (Byte,Char)]]]
case class CC_B[D](a: T_A[D], b: CC_A, c: Int) extends T_B[D, T_B[T_B[CC_A, CC_A], T_A[Byte]]]
case class CC_C[E, F]() extends T_B[E, T_B[T_B[CC_A, CC_A], T_A[Byte]]]
case class CC_D(a: Char, b: (CC_A,CC_A)) extends T_B[CC_C[CC_C[CC_A, CC_A], T_B[CC_A, Char]], T_B[T_B[CC_A, CC_A], T_A[Byte]]]

val v_a: T_B[Byte, T_B[T_B[CC_A, CC_A], T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _), _) => 0 
  case CC_C() => 1 
}
}