package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[(Boolean,Boolean)], c: (T_A[Int],(Byte,Int))) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[Byte]]]
case class CC_C() extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,(_,_))) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}