package Program_31 

package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[C, C], C]
case class CC_B[E](a: Boolean) extends T_A[T_A[E, E], E]
case class CC_C[F](a: (Char,Int)) extends T_A[T_A[F, F], F]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(('x',12)) => 2 
  case CC_C(_) => 3 
}
}
// This is not matched: (CC_A Int Boolean (T_A (T_A Int Int) Int))
// This is not matched: (CC_B Byte Byte (T_A Byte Byte))