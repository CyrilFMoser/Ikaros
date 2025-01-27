package Program_15 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[T_A[Byte]]
case class CC_B() extends T_A[T_A[Byte]]
case class CC_C(a: T_A[Int]) extends T_B[(CC_B,(Int,Char))]
case class CC_D(a: ((Int,Boolean),Int)) extends T_B[(CC_B,(Int,Char))]
case class CC_E[D]() extends T_B[(CC_B,(Int,Char))]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_B()) => 1 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A Byte)))
// This is not matched: Pattern match is empty without constants