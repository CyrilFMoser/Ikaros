package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Int) extends T_A[T_A[T_A[(Char,Boolean)]]]
case class CC_B(a: Byte) extends T_A[T_A[T_A[(Char,Boolean)]]]
case class CC_C(a: T_B[T_B[CC_A, CC_B], T_A[CC_B]], b: CC_B, c: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[(Char,Boolean)]]]
case class CC_D(a: CC_A) extends T_B[Boolean, (T_B[CC_B, CC_C],CC_B)]

val v_a: T_A[T_A[T_A[(Char,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, CC_B(_), _) => 2 
}
}