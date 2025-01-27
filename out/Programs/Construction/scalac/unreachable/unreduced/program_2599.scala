package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Byte],T_A[Byte]), b: T_A[Char], c: T_A[T_A[Int]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: Boolean, b: CC_A, c: (CC_A,T_A[CC_A])) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: Char) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}