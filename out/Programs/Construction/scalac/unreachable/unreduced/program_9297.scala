package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D, c: T_A[D]) extends T_A[D]
case class CC_B(a: T_A[Char], b: T_A[T_A[(Boolean,Boolean)]]) extends T_A[T_B[(Boolean,(Char,Int)), T_B[Char, Boolean]]]
case class CC_C(a: T_B[(CC_B,Char), Int]) extends T_A[T_B[(Boolean,(Char,Int)), T_B[Char, Boolean]]]
case class CC_D() extends T_B[T_B[CC_A[CC_B], Boolean], CC_C]

val v_a: T_A[T_B[(Boolean,(Char,Int)), T_B[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}