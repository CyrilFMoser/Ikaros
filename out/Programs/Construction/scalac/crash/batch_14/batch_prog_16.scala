package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Char,Byte)], b: (T_A[Byte],T_A[Byte])) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[Int]) extends T_A[T_A[T_A[Byte]]]
case class CC_C[B](a: CC_A, b: CC_A) extends T_A[B]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_C(_, _),CC_C(_, _))) => 0 
  case CC_B(CC_C(CC_A(_, _), _)) => 1 
  case CC_C(_, _) => 2 
}
}