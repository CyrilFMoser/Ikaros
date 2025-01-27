package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Byte,Int)) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[CC_A], b: (T_A[Byte],CC_A), c: T_A[Int]) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
  case CC_A((_,_)) => 1 
  case CC_B(_, (_,CC_A(_)), _) => 2 
}
}