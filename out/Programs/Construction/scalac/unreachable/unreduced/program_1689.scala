package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[Boolean], b: (T_A[Int, Boolean],T_B[Int]), c: T_B[D]) extends T_A[D, T_A[Char, T_B[(Boolean,Boolean)]]]
case class CC_B[E](a: ((Byte,Int),CC_A[Boolean])) extends T_A[E, T_A[Char, T_B[(Boolean,Boolean)]]]

val v_a: T_A[Char, T_A[Char, T_B[(Boolean,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B((_,_)) => 1 
}
}