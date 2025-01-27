package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Char,Boolean)]]) extends T_A[T_A[(Boolean,(Boolean,Char))]]
case class CC_B() extends T_A[T_A[(Boolean,(Boolean,Char))]]

val v_a: T_A[T_A[(Boolean,(Boolean,Char))]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}