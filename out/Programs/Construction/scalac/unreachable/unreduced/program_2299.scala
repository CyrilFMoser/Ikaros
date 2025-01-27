package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: (T_A[Byte, Int],T_B[Char]), c: D) extends T_A[T_B[Byte], D]
case class CC_B() extends T_A[T_B[Byte], T_B[CC_A[Boolean]]]
case class CC_C(a: T_A[T_B[Byte], Int]) extends T_A[T_B[Byte], T_B[T_A[CC_B, Int]]]
case class CC_D[E](a: T_B[T_B[(CC_B,CC_C)]], b: T_A[T_B[Byte], E]) extends T_B[E]
case class CC_E[G](a: CC_D[G]) extends T_B[G]

val v_a: T_A[T_B[Byte], T_B[T_A[CC_B, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_D(_, _)) => 0 
  case CC_A(_, _, CC_E(_)) => 1 
  case CC_C(CC_A(CC_D(_, _), (_,_), _)) => 2 
  case CC_C(CC_A(CC_E(_), (_,_), _)) => 3 
}
}