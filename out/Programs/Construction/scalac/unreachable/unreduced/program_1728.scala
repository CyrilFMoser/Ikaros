package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Byte],T_A[Boolean])) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A, b: Byte, c: CC_A) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: T_A[Int]) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(CC_A(_), _, _) => 1 
  case CC_C(_) => 2 
}
}