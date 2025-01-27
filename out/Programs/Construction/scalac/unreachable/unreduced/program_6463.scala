package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, (Char,Byte)], T_A[Int, Byte]]) extends T_A[(T_A[Boolean, Int],T_A[Char, Int]), Boolean]
case class CC_B() extends T_A[(T_A[Boolean, Int],T_A[Char, Int]), Boolean]

val v_a: T_A[(T_A[Boolean, Int],T_A[Char, Int]), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}