package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (T_A[Int],T_A[Byte]), b: B) extends T_A[T_A[Char]]
case class CC_B(a: T_A[T_A[Char]], b: T_A[T_A[Boolean]]) extends T_A[T_A[Char]]
case class CC_C(a: Boolean) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}