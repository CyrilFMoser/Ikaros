package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[Byte]
case class CC_B(a: CC_A) extends T_A[Byte]
case class CC_C() extends T_A[CC_A]
case class CC_D(a: T_A[Byte], b: (T_B[Byte],(CC_B,CC_B)), c: Int) extends T_B[Byte]
case class CC_E() extends T_B[Byte]
case class CC_F(a: Boolean) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_), (CC_D(_, _, _),(_,_)), _) => 0 
  case CC_D(CC_B(CC_A(_)), (CC_D(_, _, _),(_,_)), _) => 1 
  case CC_D(CC_A(_), (CC_E(),(_,_)), _) => 2 
  case CC_D(CC_B(CC_A(_)), (CC_E(),(_,_)), _) => 3 
  case CC_D(CC_A(_), (CC_F(_),(_,_)), _) => 4 
  case CC_D(CC_B(CC_A(_)), (CC_F(_),(_,_)), _) => 5 
  case CC_E() => 6 
  case CC_F(_) => 7 
}
}