package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_B[D]) extends T_A[D]
case class CC_C(a: T_A[T_A[Char]], b: (CC_A[Int],CC_A[Byte]), c: T_A[T_A[(Int,Byte)]]) extends T_B[T_A[T_A[Byte]]]
case class CC_D(a: T_A[T_B[CC_C]], b: T_B[Char], c: T_A[CC_A[CC_C]]) extends T_B[T_A[T_A[Byte]]]
case class CC_E(a: T_A[T_B[CC_D]]) extends T_B[T_A[T_A[Byte]]]

val v_a: T_B[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_C(_, (_,_), CC_A()) => 0 
  case CC_C(_, (_,_), CC_B(_)) => 1 
  case CC_D(_, _, CC_A()) => 2 
  case CC_D(_, _, CC_B(_)) => 3 
  case CC_E(_) => 4 
}
}