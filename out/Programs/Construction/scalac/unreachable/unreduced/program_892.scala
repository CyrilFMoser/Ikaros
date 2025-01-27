package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Int, b: Boolean) extends T_A[T_A[D, D], D]
case class CC_B(a: T_A[CC_A[Char], CC_A[Boolean]], b: T_A[CC_A[Char], CC_A[Byte]], c: T_B[T_B[(Int,Int)]]) extends T_B[T_A[T_B[Char], T_B[(Boolean,Int)]]]
case class CC_C(a: CC_A[CC_B], b: T_A[T_A[Boolean, Boolean], Boolean]) extends T_B[T_A[T_B[Char], T_B[(Boolean,Int)]]]
case class CC_D(a: Boolean, b: T_A[Char, Byte]) extends T_B[T_A[T_B[Char], T_B[(Boolean,Int)]]]

val v_a: T_B[T_A[T_B[Char], T_B[(Boolean,Int)]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _) => 1 
  case CC_D(_, _) => 2 
}
}