package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B(a: T_A[(Char,Byte)]) extends T_A[(T_A[Char],T_A[Int])]
case class CC_C(a: T_A[CC_B], b: Int) extends T_A[(T_A[Char],T_A[Int])]

val v_a: T_A[(T_A[Char],T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_C(CC_A(), _) => 2 
}
}