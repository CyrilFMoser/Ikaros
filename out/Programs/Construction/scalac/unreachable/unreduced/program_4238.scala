package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: C, c: T_A[((Byte,Int),(Int,Boolean)), T_A[((Byte,Int),(Int,Boolean)), ((Byte,Int),(Int,Boolean))]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: Boolean) extends T_A[D, (T_A[(Boolean,Int), Boolean],T_A[(Char,Boolean), Byte])]
case class CC_C[E](a: T_A[E, E]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, true, _) => 0 
  case CC_A(_, false, _) => 1 
  case CC_C(_) => 2 
}
}