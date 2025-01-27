package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_A[Char, (Int,Int)], T_A[T_A[Boolean, Int], T_A[(Int,Int), Char]]]
case class CC_B(a: T_A[(CC_A,CC_A), CC_A]) extends T_A[T_A[Char, (Int,Int)], T_A[T_A[Boolean, Int], T_A[(Int,Int), Char]]]
case class CC_C(a: T_A[(CC_B,(Byte,Boolean)), Boolean], b: CC_A, c: Int) extends T_A[T_A[Char, (Int,Int)], T_A[T_A[Boolean, Int], T_A[(Int,Int), Char]]]
case class CC_D(a: T_A[Char, CC_B], b: CC_C, c: T_A[Byte, CC_B]) extends T_B
case class CC_E(a: CC_C) extends T_B
case class CC_F(a: T_B, b: CC_C, c: T_B) extends T_B

val v_a: T_A[T_A[Char, (Int,Int)], T_A[T_A[Boolean, Int], T_A[(Int,Int), Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}