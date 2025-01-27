package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[Int, Char], T_A[Char, (Boolean,Boolean)]]]
case class CC_B[D](a: Byte) extends T_A[D, T_A[T_A[Int, Char], T_A[Char, (Boolean,Boolean)]]]
case class CC_C() extends T_A[Boolean, T_A[T_A[Int, Char], T_A[Char, (Boolean,Boolean)]]]

val v_a: T_A[Boolean, T_A[T_A[Int, Char], T_A[Char, (Boolean,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}