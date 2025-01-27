package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Char],T_A[Boolean]), b: T_A[Char], c: (T_A[Boolean],T_A[Int])) extends T_A[T_A[(Char,Byte)]]
case class CC_B(a: (CC_A,CC_A), b: CC_A, c: Int) extends T_A[T_A[(Char,Byte)]]
case class CC_C() extends T_A[T_A[(Char,Byte)]]

val v_a: T_A[T_A[(Char,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}