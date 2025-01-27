package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Char,Boolean)]]
case class CC_B(a: T_A[Int], b: T_A[((Char,Byte),Char)]) extends T_A[T_A[(Char,Boolean)]]

val v_a: T_A[T_A[(Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}