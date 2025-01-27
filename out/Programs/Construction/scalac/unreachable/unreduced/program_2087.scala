package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E, F](a: F, b: (T_A[(Boolean,Char)],T_B[Boolean, Int])) extends T_A[E]
case class CC_C[G](a: Char) extends T_B[G, CC_B[G, G]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (CC_A(),_)) => 1 
}
}
// This is not matched: CC_B(_, (CC_B(_, _),_))