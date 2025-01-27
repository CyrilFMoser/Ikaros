package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (T_A[(Char,Boolean), T_B],Int), b: Boolean, c: T_A[T_B, Char]) extends T_A[(T_A[T_B, Char],T_A[T_B, Int]), T_A[T_A[Int, (Int,Int)], T_A[(Byte,Byte), T_B]]]
case class CC_B(a: T_B, b: T_A[CC_A, T_B]) extends T_A[(T_A[T_B, Char],T_A[T_B, Int]), T_A[T_A[Int, (Int,Int)], T_A[(Byte,Byte), T_B]]]
case class CC_C(a: Int) extends T_A[(T_A[T_B, Char],T_A[T_B, Int]), T_A[T_A[Int, (Int,Int)], T_A[(Byte,Byte), T_B]]]
case class CC_D(a: Boolean, b: CC_C, c: Int) extends T_B
case class CC_E() extends T_B
case class CC_F() extends T_B

val v_a: T_A[(T_A[T_B, Char],T_A[T_B, Int]), T_A[T_A[Int, (Int,Int)], T_A[(Byte,Byte), T_B]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(CC_D(_, _, _), _) => 1 
  case CC_B(CC_E(), _) => 2 
  case CC_B(CC_F(), _) => 3 
  case CC_C(_) => 4 
}
}