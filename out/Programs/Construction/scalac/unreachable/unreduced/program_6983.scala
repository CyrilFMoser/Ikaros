package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B() extends T_B[Char]
case class CC_C(a: (CC_A[CC_B],Char), b: (T_B[Boolean],T_A[CC_B]), c: (T_A[Byte],T_A[CC_B])) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((CC_A(),'x'), (_,CC_A()), (CC_A(),CC_A())) => 1 
}
}
// This is not matched: CC_C((CC_A(),_), (_,CC_A()), (CC_A(),CC_A()))