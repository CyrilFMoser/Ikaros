package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_B[Char]]]
case class CC_B[C](a: T_A[C], b: (T_B[CC_A],T_A[CC_A])) extends T_B[C]
case class CC_C[D]() extends T_B[D]
case class CC_D[E](a: (T_B[Byte],CC_C[CC_A])) extends T_B[E]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, (CC_B(_, _),_)) => 0 
  case CC_B(_, (CC_C(),_)) => 1 
  case CC_B(_, (CC_D(_),_)) => 2 
  case CC_C() => 3 
  case CC_D(_) => 4 
}
}