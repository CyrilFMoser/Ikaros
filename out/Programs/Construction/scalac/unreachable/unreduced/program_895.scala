package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_A[Byte, T_A[Boolean, Boolean]], D]
case class CC_B(a: CC_A[T_B[Byte]], b: T_B[T_B[Boolean]]) extends T_A[T_A[Byte, T_A[Boolean, Boolean]], T_B[T_A[Char, (Boolean,Byte)]]]
case class CC_C() extends T_B[(CC_A[CC_B],CC_A[CC_B])]
case class CC_D(a: CC_A[T_A[(Byte,Byte), Char]]) extends T_B[(CC_A[CC_B],CC_A[CC_B])]
case class CC_E(a: (CC_A[CC_D],Boolean), b: T_A[CC_A[Char], T_A[CC_C, CC_D]], c: Byte) extends T_B[(CC_A[CC_B],CC_A[CC_B])]

val v_a: T_B[(CC_A[CC_B],CC_A[CC_B])] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_E((_,_), _, _) => 1 
}
}
// This is not matched: CC_D(CC_A())