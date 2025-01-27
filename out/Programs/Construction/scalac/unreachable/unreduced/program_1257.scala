package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[(T_A[Char, Int],T_A[Char, Boolean]), T_A[Int, (Char,Char)]]
case class CC_B(a: CC_A, b: (CC_A,CC_A)) extends T_A[(T_A[Char, Int],T_A[Char, Boolean]), T_A[Int, (Char,Char)]]
case class CC_C(a: CC_A, b: T_A[CC_A, Byte]) extends T_A[(T_A[Char, Int],T_A[Char, Boolean]), T_A[Int, (Char,Char)]]

val v_a: T_A[(T_A[Char, Int],T_A[Char, Boolean]), T_A[Int, (Char,Char)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), (_,_)) => 1 
  case CC_C(CC_A(), _) => 2 
}
}