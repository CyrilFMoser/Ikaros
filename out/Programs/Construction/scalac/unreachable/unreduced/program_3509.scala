package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: Char, b: (T_A[Char],(Int,Int)), c: CC_A[CC_A[Boolean]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: Byte) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, (_,(_,_)), CC_A(_)) => 1 
  case CC_C(_) => 2 
}
}