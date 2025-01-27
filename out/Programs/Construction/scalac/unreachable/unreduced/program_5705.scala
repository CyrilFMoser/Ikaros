package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[((Int,(Boolean,Int)),Boolean)]
case class CC_B(a: CC_A, b: CC_A, c: T_A[Char]) extends T_A[((Int,(Boolean,Int)),Boolean)]

val v_a: T_A[((Int,(Boolean,Int)),Boolean)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
}
}