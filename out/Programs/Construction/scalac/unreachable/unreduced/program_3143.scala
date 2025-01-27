package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(T_A[Char],T_A[Boolean])]
case class CC_B(a: T_A[(CC_A,CC_A)], b: CC_A, c: Byte) extends T_A[(T_A[Char],T_A[Boolean])]
case class CC_C(a: Int, b: T_A[CC_A], c: (CC_A,CC_B)) extends T_A[(T_A[Char],T_A[Boolean])]

val v_a: T_A[(T_A[Char],T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
  case CC_C(_, _, (CC_A(),CC_B(_, _, _))) => 2 
}
}