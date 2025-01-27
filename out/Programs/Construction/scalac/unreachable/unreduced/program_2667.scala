package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Byte],(Char,Char))) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_A[Int], b: T_A[Byte]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: Int) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_))) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}