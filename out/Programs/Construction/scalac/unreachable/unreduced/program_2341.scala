package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_A[Char]]) extends T_A[(T_A[Byte],T_A[Boolean])]
case class CC_B(a: CC_A, b: (CC_A,Boolean), c: CC_A) extends T_A[(T_A[Byte],T_A[Boolean])]
case class CC_C[B]() extends T_A[(T_A[Byte],T_A[Boolean])]

val v_a: T_A[(T_A[Byte],T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), (CC_A(_, _),true), CC_A(_, _)) => 1 
  case CC_B(CC_A(_, _), (CC_A(_, _),false), CC_A(_, _)) => 2 
  case CC_C() => 3 
}
}