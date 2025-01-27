package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(Int,Boolean)]
case class CC_B(a: (T_A[CC_A],CC_A)) extends T_A[(Int,Boolean)]
case class CC_C() extends T_A[(Int,Boolean)]

val v_a: T_A[(Int,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_A())) => 1 
  case CC_C() => 2 
}
}