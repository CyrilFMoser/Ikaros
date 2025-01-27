package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (Char,Int), b: Byte) extends T_A[T_A[Byte, T_A[Byte, Byte]], T_B[T_A[Byte, (Char,Int)]]]
case class CC_B(a: T_A[T_B[Byte], CC_A[Byte]], b: Boolean, c: Byte) extends T_A[T_A[Byte, T_A[Byte, Byte]], T_B[T_A[Byte, (Char,Int)]]]
case class CC_C() extends T_B[CC_B]
case class CC_D(a: CC_A[(CC_B,CC_B)], b: CC_A[CC_C], c: (CC_B,(CC_B,CC_B))) extends T_B[CC_B]
case class CC_E() extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_A(_, _), (CC_B(_, _, _),(_,_))) => 1 
  case CC_E() => 2 
}
}