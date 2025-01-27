package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Byte],Int), b: (T_A[Boolean],T_A[Char])) extends T_A[T_A[T_A[(Int,Boolean)]]]
case class CC_B(a: CC_A, b: Boolean) extends T_A[T_A[T_A[(Int,Boolean)]]]
case class CC_C[B](a: CC_B, b: CC_B) extends T_A[T_A[T_A[(Int,Boolean)]]]

val v_a: T_A[T_A[T_A[(Int,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_B(_, _), CC_B(_, _)) => 2 
}
}