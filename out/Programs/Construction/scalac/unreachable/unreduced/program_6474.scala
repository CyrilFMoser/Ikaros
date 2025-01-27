package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (T_B,((Byte,Char),T_B))) extends T_A[T_A[Boolean, T_B], T_B]
case class CC_B(a: CC_A, b: T_A[T_A[Boolean, Int], T_A[T_B, (Int,Byte)]], c: CC_A) extends T_A[T_A[Boolean, T_B], T_B]
case class CC_C(a: T_A[Boolean, (CC_A,CC_B)]) extends T_A[T_A[Boolean, T_B], T_B]
case class CC_D(a: CC_B, b: T_A[T_A[Boolean, T_B], T_B], c: CC_A) extends T_B
case class CC_E() extends T_B
case class CC_F(a: T_A[T_A[Int, CC_C], Char], b: CC_D) extends T_B

val v_a: T_A[T_A[Boolean, T_B], T_B] = null
val v_b: Int = v_a match{
  case CC_A((CC_D(_, _, _),(_,_))) => 0 
  case CC_A((CC_E(),(_,_))) => 1 
  case CC_A((CC_F(_, _),(_,_))) => 2 
  case CC_B(_, _, _) => 3 
  case CC_C(_) => 4 
}
}