package Program_31 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: T_A, b: T_A, c: C) extends T_A
case class CC_C(a: CC_B[Byte]) extends T_A
case class CC_D[D](a: CC_A, b: CC_A) extends T_B[T_B[T_A, T_A], D]
case class CC_E[E, F](a: (CC_C,CC_C), b: (CC_C,(Byte,Byte))) extends T_B[T_B[T_A, T_A], E]
case class CC_F[G, H]() extends T_B[G, H]

val v_a: T_B[T_B[T_A, T_A], T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), _) => 0 
  case CC_D(_, _) => 1 
  case CC_D(CC_A(), CC_A()) => 2 
  case CC_F() => 3 
  case CC_E(_, (CC_C(_),(_,_))) => 4 
}
}
// This is not matched: (CC_E T_A
//      T_A
//      (Tuple Wildcard Wildcard)
//      (Tuple Wildcard (Tuple Wildcard Byte))
//      (T_B (T_B T_A T_A) T_A))
// This is not matched: (CC_A Boolean (T_A Boolean))