package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_B(a: T_B[(CC_A,(Boolean,Int))], b: T_A[T_A[Byte]], c: ((CC_A,CC_A),T_A[CC_A])) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B(_, _, (_,_))) => 2 
  case CC_B(_, _, ((_,_),_)) => 3 
}
}