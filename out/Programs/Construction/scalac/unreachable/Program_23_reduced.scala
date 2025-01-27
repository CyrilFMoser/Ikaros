object Test {
sealed trait T_A[A]
case class CC_A(a:      Char             , b: (T_A[Int],Boolean)) extends T_A[T_A[T_A[Int]]]
case class CC_B() extends T_A[T_A[T_A[Int]]]
val v_a: T_A[T_A[T_A[Int]]] = null
val v_b      = v_a match{
  case CC_A(_, (_,_)) => 0
  case CC_B() => 1
}
}
