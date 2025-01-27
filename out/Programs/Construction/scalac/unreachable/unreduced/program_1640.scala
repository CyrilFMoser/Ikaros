package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: E) extends T_A[D, T_B[Char]]
case class CC_B(a: CC_A[Boolean, (Boolean,Char)], b: (T_A[(Int,Boolean), Byte],Int), c: CC_A[(Byte,Int), CC_A[Int, Boolean]]) extends T_A[T_B[Char], T_B[Char]]
case class CC_C(a: T_A[CC_B, Char]) extends T_A[T_B[Char], T_B[Char]]
case class CC_D() extends T_B[T_B[CC_C]]
case class CC_E(a: T_B[T_B[CC_C]], b: T_A[T_B[Char], T_B[Char]]) extends T_B[T_B[CC_C]]

val v_a: T_A[T_B[Char], T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}