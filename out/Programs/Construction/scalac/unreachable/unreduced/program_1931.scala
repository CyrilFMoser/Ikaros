package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(T_A[Boolean],T_A[Char])]
case class CC_B(a: T_A[CC_A], b: ((Boolean,CC_A),Char), c: (CC_A,CC_A)) extends T_A[(T_A[Boolean],T_A[Char])]

val v_a: T_A[(T_A[Boolean],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}