package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[Byte], c: (T_A[Int],T_A[Boolean])) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_B, b: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}