package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int],T_A[Boolean]), b: T_A[T_A[Boolean]], c: T_A[T_A[Char]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A) extends T_A[CC_A]
case class CC_C(a: (T_A[CC_A],T_A[CC_A])) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_) => 1 
}
}