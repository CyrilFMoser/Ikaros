package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]]) extends T_A[CC_A[Int], ((Int,Char),(Byte,(Int,Char)))]
case class CC_C(a: T_A[Char, T_A[Int, Int]]) extends T_A[CC_A[(Boolean,Boolean)], T_A[CC_A[(Boolean,Boolean)], CC_A[(Boolean,Boolean)]]]

val v_a: T_A[CC_A[(Boolean,Boolean)], T_A[CC_A[(Boolean,Boolean)], CC_A[(Boolean,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_) => 1 
}
}